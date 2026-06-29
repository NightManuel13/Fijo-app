package unitec.machigues.fijo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Fijo",
    ) {
        Fijo_App()
    }
}