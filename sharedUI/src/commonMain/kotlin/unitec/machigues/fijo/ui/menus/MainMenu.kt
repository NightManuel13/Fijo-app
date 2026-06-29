package unitec.machigues.fijo.ui.menus

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import fijo.sharedui.generated.resources.Res
import fijo.sharedui.generated.resources.compose_multiplatform
import unitec.machigues.fijo.ui.presentation.components.BottomBar
import unitec.machigues.fijo.ui.presentation.components.TopBar
import unitec.machigues.fijo.ui.theme.FijoTheme

enum class Screen(val route: String, val title: String) {
    MainMenu("main_menu", "Menú Principal"),
    Providers("providers", "Proveedores"),
    Solicitude("solicitude", "Solicitudes"),
    Message("messages", "Mensajes"),
    Profile("profile", "Perfil"),
    Notifications("notifications", "Notificaciones")
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MainMenuScreen(onNavigate: (Screen) -> Unit = {}) {

    var currentScreen by remember { mutableStateOf(Screen.MainMenu) }
    FijoTheme {
        Scaffold(
            topBar = {
                TopBar(
                    onNotificationClick = { onNavigate(Screen.Notifications) }
                )
            },
            bottomBar = {
                BottomBar(
                    currentScreen = currentScreen,
                    onScreenSelected = { screen ->
                        currentScreen = screen
                        onNavigate(screen)
                    }
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                Box(
                    modifier = Modifier.weight(1f).fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    //Todo; cargar las paginas que estan en screen
                }
            }
        }
    }
}
