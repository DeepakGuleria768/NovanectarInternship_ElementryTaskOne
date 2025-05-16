package com.example.prfofessionalportfolioapplication.Screens.ResumeUploadingScreen

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient

object SupabaseClientHolder {
    val supabase: SupabaseClient by lazy {
        createSupabaseClient(
            supabaseUrl = "https://dxlkqytvkompmssrkurz.supabase.co",
            supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImR4bGtxeXR2a29tcG1zc3JrdXJ6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NDcxOTY5NjYsImV4cCI6MjA2Mjc3Mjk2Nn0.N4WkDbX4miRo6PD8OVBbklhnXqK6i0s0p7Bu6JIKFUg"
        ){
            install(io.github.jan.supabase.storage.Storage)
        }
    }
}