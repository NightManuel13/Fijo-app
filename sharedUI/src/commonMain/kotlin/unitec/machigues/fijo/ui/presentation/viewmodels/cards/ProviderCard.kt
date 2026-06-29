package unitec.machigues.fijo.ui.presentation.viewmodels.cards

/*
import com.unitec.agrohack.ui.Farm
import com.unitec.agrohack.ui.ProductionItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProviderCard(
    farm: Farm,
    onClick: (Farm) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick(farm) },
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Farm Image
                AsyncImage(
                    model = farm.imageUrl,
                    contentDescription = farm.name,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop
                )
                
                // Farm Info
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Text(
                            text = farm.name,
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier.weight(1f)
                        )
                        
                        AssistChip(
                            onClick = { },
                            label = {
                                Text(
                                    text = farm.certificate,
                                    style = MaterialTheme.typography.labelSmall
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = null,
                                    modifier = Modifier.size(12.dp)
                                )
                            },
                            colors = AssistChipDefaults.assistChipColors(
                                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                                labelColor = MaterialTheme.colorScheme.onSecondaryContainer
                            )
                        )
                    }
                    
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = null,
                            modifier = Modifier.size(12.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = farm.location,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    
                    Text(
                        text = farm.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        lineHeight = MaterialTheme.typography.bodySmall.lineHeight
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            // Production Section
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Producción",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    // Production Items as Chips
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        farm.production.take(3).forEach { item ->
                            AssistChip(
                                onClick = { },
                                label = {
                                    Text(
                                        text = "${item.name}: ${item.value}%",
                                        style = MaterialTheme.typography.labelSmall
                                    )
                                },
                                colors = AssistChipDefaults.assistChipColors(
                                    containerColor = item.color.copy(alpha = 0.1f),
                                    labelColor = item.color
                                ),
                                border = AssistChipDefaults.assistChipBorder(
                                    borderColor = item.color
                                )
                            )
                        }
                    }
                }
                
                // Donut Chart
                DonutChart(
                    data = farm.production,
                    modifier = Modifier.size(64.dp)
                )
            }
        }
    }
}

private fun RowScope.AssistChip(
    onClick: () -> Unit,
    label: @Composable () -> Unit,
    colors: ChipColors,
    border: ChipBorder
) {
}

@Composable
fun DonutChart(
    data: List<ProductionItem>,
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier) {
        val total = data.sumOf { it.value }
        var currentAngle = -90f
        val strokeWidth = size.width * 0.2f
        val radius = (size.width - strokeWidth) / 2f
        
        data.forEach { item ->
            val sweepAngle = (item.value.toFloat() / total) * 360f
            drawArc(
                color = item.color,
                startAngle = currentAngle,
                sweepAngle = sweepAngle,
                useCenter = false,
                style = Stroke(width = strokeWidth)
            )
            currentAngle += sweepAngle
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProviderCardPreview() {
    MaterialTheme {
        ProviderCard(
            farm = Farm(
                id = 1,
                name = "Finca La Esperanza",
                description = "Finca especializada en cultivos orgánicos de café y aguacate. Utilizamos métodos sostenibles y tecnología moderna.",
                location = "Manizales, Caldas",
                imageUrl = "",
                certificate = "Orgánico",
                production = listOf(
                    ProductionItem("Café", 60, Color(0xFF2D5F3F)),
                    ProductionItem("Aguacate", 30, Color(0xFF52B788)),
                    ProductionItem("Otros", 10, Color(0xFF81C784))
                )
            ),
            onClick = { }
        )
    }
}
*/