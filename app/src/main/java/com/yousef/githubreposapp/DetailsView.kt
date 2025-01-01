package com.yousef.githubreposapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DetailsViewContent(repo: Repo, modifier: Modifier = Modifier,paddingValues: PaddingValues) {

    Column(
        modifier.padding(horizontal = 40.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = repo.img),
            contentDescription = null,
            modifier.size(100.dp)
        )

        Text(text = repo.name, fontWeight = FontWeight(500))

        Spacer(modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = modifier.fillMaxWidth(),
        ) {
            Row {
                Text(text = repo.rate.toString())
                Spacer(modifier = modifier.width(3.dp))
                Image(
                    painter = painterResource(id = R.drawable.star_icon),
                    contentDescription = null,
                    modifier.size(20.dp)
                )
            }
            Spacer(modifier = modifier.width(10.dp))
            Row {
                Text(text = repo.rate.toString())
                Spacer(modifier = modifier.width(3.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    modifier.size(20.dp)
                )
            }
            Spacer(modifier = modifier.width(10.dp))
            Row {
                Text(text = repo.rate.toString())
                Spacer(modifier = modifier.width(3.dp))
                Image(
                    painter = painterResource(id = R.drawable.star_icon),
                    contentDescription = null,
                    modifier.size(20.dp)
                )
            }
        }

        Text(text = repo.desc)

        Spacer(modifier = modifier.weight(1f))


        Button(
            onClick = {},
            shape = RoundedCornerShape(12.dp),
            modifier = modifier.width(180.dp),

            ) {
            Text(text = "Show Issues")
        }

    }
}


@Preview
@Composable
fun DetailsPrev() {

    val modifier: Modifier = Modifier
    val repo = Repo(
        "Ruby",
        "osama mohamed",
        "tis a lsuads advocmad advka dsav avds yoused mahmiud",
        R.drawable.star_icon,
        32500
    )
    Column(
        modifier.padding(horizontal = 40.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = repo.img),
            contentDescription = null,
            modifier.size(100.dp)
        )

        Text(text = repo.name, fontWeight = FontWeight(500))

        Spacer(modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = modifier.fillMaxWidth(),
        ) {
            Row {
                Text(text = repo.rate.toString())
                Spacer(modifier = modifier.width(3.dp))
                Image(
                    painter = painterResource(id = R.drawable.star_icon),
                    contentDescription = null,
                    modifier.size(20.dp)
                )
            }
            Spacer(modifier = modifier.width(10.dp))
            Row {
                Text(text = repo.rate.toString())
                Spacer(modifier = modifier.width(3.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    modifier.size(20.dp)
                )
            }
            Spacer(modifier = modifier.width(10.dp))
            Row {
                Text(text = repo.rate.toString())
                Spacer(modifier = modifier.width(3.dp))
                Image(
                    painter = painterResource(id = R.drawable.star_icon),
                    contentDescription = null,
                    modifier.size(20.dp)
                )
            }
        }

        Text(text = repo.desc)

        Spacer(modifier = modifier.weight(1f))


        Button(
            onClick = {},
            shape = RoundedCornerShape(12.dp),
            modifier = modifier.width(180.dp),

            ) {
            Text(text = "Show Issues")
        }

    }
}