package com.example.expandablecardwithanimation

import android.icu.text.CaseMap.Title
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.expandablecardwithanimation.ui.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ExandableCard(
    title: String,
    titleFontSize:TextUnit=MaterialTheme.typography.h6.fontSize,
    titleFontWeight: FontWeight=FontWeight.Bold,
    descrption:String,
    descrptionFontSize:TextUnit=MaterialTheme.typography.subtitle1.fontSize,
    descrptionFontWeight: FontWeight=FontWeight.Normal,
    descrptionMaxLine:Int=4,
    shape:CornerBasedShape=Shapes.medium,
    padding: Dp=12.dp
) {
    var expandedState by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(targetValue = if (expandedState) 180f else 0f)
    Card(modifier = Modifier
        .fillMaxWidth()
        .animateContentSize(
            animationSpec = tween(
                durationMillis = 300, easing = LinearOutSlowInEasing
            )
        ),
        shape = shape,
        onClick = {
            expandedState = !expandedState
        }

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding)
        )
        {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    modifier = Modifier.weight(6f),
                    text =title,
                    fontWeight = titleFontWeight,

                    fontSize =titleFontSize,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                /*//fontSize =MaterialTheme.typography.h6.fontSize,*/
                IconButton(
                    modifier = Modifier
                        .alpha(ContentAlpha.medium)
                        .weight(1f)
                        .rotate(rotationState),
                    onClick = {
                    expandedState=!expandedState
                    /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ArrowDropDown,
                        contentDescription ="Drop_Down_Arrow" )
                    
                }

                }
            if (expandedState) {
                Text(
                    text = descrption,
                    fontSize = descrptionFontSize,
                    fontWeight = descrptionFontWeight,
                    maxLines =descrptionMaxLine,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview
@Composable
fun ExapandablePreview() {
    ExandableCard(
        title = "My Title",
        descrption = "It is an important property of pyMOR’s interfaces that each method either returns\n" +
                "low-dimensional data or new VectorArray, Operator or Discretization objects. This\n" +
                "ensures that no high-dimensional data ever has to be communicated between the external\n" +
                "solver and pyMOR and that no code for handling the solver-specific high-dimensional data\n" +
                "structures has to be added to pyMOR.")
}