package com.example.prfofessionalportfolioapplication.Screens.ResumeUploadingScreen

import android.content.Context
import android.net.Uri
import android.util.Log
import android.widget.Toast
import io.github.jan.supabase.storage.storage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// by database password is deepak@1234##
fun uploadResumeToSupabase(context: Context, uri: Uri,onComplete:()->Unit) {
    val client = SupabaseClientHolder.supabase
    val storage = client.storage

    val inputStream = context.contentResolver.openInputStream(uri)
    val fileName = "resume_${System.currentTimeMillis()}.pdf"
    val bucketName = "jobportalappstorage"

    val byteArray = inputStream?.readBytes()

    if (byteArray != null) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                // Upload to the root of the bucket instead of trying to create a folder
                storage.from(bucketName).upload(
                    path = fileName,  // Don't include "resumes/" prefix
                    data = byteArray,
                    upsert = true  // Replace if file exists
                )

                // Get public URL
                val publicUrl = storage.from(bucketName).publicUrl(path = fileName)

                withContext(Dispatchers.Main) {
                    Toast.makeText(context, "Resume uploaded successfully!", Toast.LENGTH_SHORT).show()
                    Log.d("Supabase", "Resume URL: $publicUrl")
                    onComplete()
                }

            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    val errorMsg = "Upload failed: ${e.message}"
                    Toast.makeText(context, errorMsg, Toast.LENGTH_LONG).show()
                    Log.e("Supabase", errorMsg, e)
                    onComplete()
                    // Print detailed stack trace for debugging
                    e.printStackTrace()
                }
            } finally {
                inputStream?.close() // Always close stream
            }
        }
    } else {
        Toast.makeText(context, "Failed to read the file!", Toast.LENGTH_SHORT).show()
        onComplete()
    }
}
