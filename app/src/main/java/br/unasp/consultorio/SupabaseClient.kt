package br.unasp.consultorio

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupabaseClient {
    val supabase = createSupabaseClient(
        supabaseUrl = "https://gmjmjzhshhcdvrxhdjkj.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imdtam1qemhzaGhjZHZyeGhkamtqIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NDU0OTMzODcsImV4cCI6MjA2MTA2OTM4N30.BvY-JEQ0EcxNsmfORCAB6bwkV7rt6vxl8Gn73xdWX3U"
    ) {
        install(Postgrest)
    }
}