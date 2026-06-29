package unitec.machigues.fijo.ui.presentation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.automirrored.outlined.AddToHomeScreen
import androidx.compose.material.icons.automirrored.rounded.Assignment
import androidx.compose.material.icons.automirrored.rounded.Comment
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import unitec.machigues.fijo.ui.menus.Screen
import unitec.machigues.fijo.ui.theme.FijoTheme


@Composable
fun BottomBar(
    currentScreen: Screen,
    onScreenSelected: (Screen) -> Unit
) {
    NavigationBar {
        val items = listOf(
            BottomNavItem(
                screen = Screen.MainMenu,
                icon = Icons.Rounded.Home,
                label = "Inicio"
            ),
            BottomNavItem(
                screen = Screen.Providers,
                icon = Icons.Rounded.GridView,
                label = "Proveedor"
            ),
            BottomNavItem(
                screen = Screen.Solicitude,
                icon = Icons.AutoMirrored.Rounded.Assignment,
                label = "Solicitudes"
            ),
            BottomNavItem(
                screen = Screen.Message,
                icon = Icons.AutoMirrored.Rounded.Comment,
                label = "Mensajes"
            ),
            BottomNavItem(
                screen = Screen.Profile,
                icon = Icons.Rounded.Person,
                label = "Perfil"
            )
        )

        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.label
                    )
                },
                label = {
                    Text(
                        text = item.label,
                        style = MaterialTheme.typography.labelSmall
                    )
                },
                selected = currentScreen == item.screen,
                onClick = { onScreenSelected(item.screen) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.secondary,
                    selectedTextColor = MaterialTheme.colorScheme.secondary,
                    unselectedIconColor = MaterialTheme.colorScheme.primary,
                    unselectedTextColor = MaterialTheme.colorScheme.primary,
                    indicatorColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    }
}

data class BottomNavItem(
    val screen: Screen,
    val icon: ImageVector,
    val label: String
)

@Preview
@Composable
fun BottomBarPreview() {
    FijoTheme {
        BottomBar(
            currentScreen = Screen.MainMenu,
            onScreenSelected = {}
        )
    }
}