package unitec.machigues.fijo.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import fijo.sharedui.generated.resources.Res
import fijo.sharedui.generated.resources.poppins_regular
import org.jetbrains.compose.resources.Font

// Tipografías y estilos de la app
val Poppins: FontFamily
    @Composable
    get() = FontFamily(
        Font(Res.font.poppins_regular, FontWeight.Normal)
    )

val AppTypography: Typography
    @Composable
    get() = Typography(
        headlineSmall = Typography().headlineSmall.copy(fontFamily = Poppins),
        titleMedium = Typography().titleMedium.copy(fontFamily = Poppins),
        bodyLarge = Typography().bodyLarge.copy(fontFamily = Poppins),
        bodyMedium = Typography().bodyMedium.copy(fontFamily = Poppins),
        labelSmall = Typography().labelSmall.copy(fontFamily = Poppins)
    )
