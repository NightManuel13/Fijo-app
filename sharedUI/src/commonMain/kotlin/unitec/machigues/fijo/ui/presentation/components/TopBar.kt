package unitec.machigues.fijo.ui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import fijo.sharedui.generated.resources.Res
import fijo.sharedui.generated.resources.fijo
import unitec.machigues.fijo.ui.theme.FijoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    icon: (@Composable () -> Unit)? = null,
    showBackButton: Boolean = false,
    onBackClick: () -> Unit = {},
    onNotificationClick: () -> Unit = {}
) {
    CenterAlignedTopAppBar(
        title = {
            Image(
                painter = painterResource(Res.drawable.fijo),
                contentDescription = "Logo Fijo",
                modifier = Modifier.height(32.dp)
            )
        },
        navigationIcon = {
            if (showBackButton) {
                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Volver",
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
            } else if (icon != null) {
                icon()
            }
        },
        actions = {
            if (!showBackButton) {
                IconButton(onClick = onNotificationClick) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notificaciones",
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background
        )
    )
}

@androidx.compose.ui.tooling.preview.Preview
@Composable
fun TopBarPreview() {
    FijoTheme {
        TopBar(
            onNotificationClick = {}
        )
    }
}
