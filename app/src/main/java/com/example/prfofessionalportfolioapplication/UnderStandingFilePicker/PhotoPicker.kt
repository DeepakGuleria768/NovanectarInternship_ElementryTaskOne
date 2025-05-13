package com.example.prfofessionalportfolioapplication.UnderStandingFilePicker

import android.net.Uri
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.isPhotoPickerAvailable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun SinglePhotoPickerScreen() {

    // var selectedImageUri by remember { mutableStateOf<Uri?>(null) }:
    //
    //We've introduced a new state variable called selectedImageUri. Think of this as a special storage box that can hold the Uri of the selected image.
    //remember ensures that this storage box remembers the Uri even if the UI recomposes (updates).
    //mutableStateOf<Uri?>(null) means this box can initially be empty (null) or hold a Uri object later. The ? indicates it can be nullable.

    var selectImageUri by remember { mutableStateOf<Uri?>(null) }
    //  Log.d("message","${isPhotoPickerAvailable()}")
    
    //Creating a "Launcher": rememberLauncherForActivityResult helps you create a special "launcher" or "messenger" that knows how to start a specific activity (like the Camera app) and how to handle the result when it comes back.
    //Telling it What to Do: When you create this launcher, you also tell it what you want to do. For example, you might tell it, "Hey, I want to launch the camera app, and when it's done, give me back the picture the user took."
    //Remembering the Launcher: The remember part is important because this launcher needs to stick around even if your app's UI gets redrawn or updated. remember in Jetpack Compose (which is where you usually see this) helps store this launcher across these UI updates.
    //Launching the Activity: When you're ready to start the other app (like when the user clicks a button), you use this launcher to "launch" the activity. It's like sending a request to the other app.
    //Getting the Result: Once the other app finishes its job (the user takes a picture, picks a contact, etc.), it sends a "result" back to your app. The launcher you created knows how to receive this result and give it to
    // you so you can use it in your app (like displaying the picture or showing the selected contact's name).
    val pickMedia = rememberLauncherForActivityResult(PickVisualMedia()) { uri ->
        if (uri != null) {
            Log.d("message", "Selected Uri is $uri")
            selectImageUri = uri // store the ui in the container variable
        } else {
            Log.d("message", "No media selected")
        }
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {/*here we will launch the photo picker
            */
                //Launch the photo picker and let the user choose images and videos.
                pickMedia.launch(PickVisualMediaRequest(PickVisualMedia.ImageAndVideo))
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp)
                .padding(20.dp),
            shape = RectangleShape
        ) {
            Text("Pick Image")
        }
        Spacer(Modifier.height(100.dp))
        selectImageUri?.let { uri ->
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(10.dp)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {

                AsyncImage(
                    model = uri,
                    contentDescription = "image",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}
