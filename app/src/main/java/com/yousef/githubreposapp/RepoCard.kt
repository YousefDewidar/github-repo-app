package com.yousef.githubreposapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RepoCard(modifier: Modifier = Modifier, repo: Repo) {
    Row(
        modifier = modifier
            .padding(0.dp, 8.dp, 0.dp, 0.dp)
            .clip(RoundedCornerShape(13.dp))
            .background(Color.White)
            .padding(12.dp)
    ) {
        Image(
            painter = painterResource(id = repo.img),
            contentDescription = null,
            modifier.size(28.dp)
        )
        Column(
            modifier = modifier
                .padding(10.dp, 0.dp, 0.dp, 0.dp)

        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier.fillMaxWidth()
            )
            {
                Text(
                    text = repo.name,
                    maxLines = 1,
                    fontSize = 15.sp,
                    overflow = TextOverflow.Ellipsis,
                )
                Row {
                    Text(text = repo.rate.toString())
                    Spacer(modifier = modifier.width(8.dp))
                    Image(
                        painter = painterResource(id = R.drawable.star_icon),
                        contentDescription = null,
                        modifier.size(20.dp)
                    )
                }
            }
            Spacer(modifier = modifier.height(6.dp))
            Text(text = repo.owner)
            Spacer(modifier = modifier.height(8.dp))
            Text(text = repo.desc, fontWeight = FontWeight(400), fontSize = 17.sp)
        }
    }

}

@Preview
@Composable
fun RepoCardPrev() {
    val modifier = Modifier
    val repo = Repo(
        "mma",
        "osama",
        "tis a lsuads advocmad advka dsav avds",
        R.drawable.ic_launcher_background,
        5000
    )
    Row(
        modifier = modifier
            .padding(0.dp, 8.dp, 0.dp, 0.dp)
            .clip(RoundedCornerShape(13.dp))
            .background(Color.White)
            .padding(12.dp)
    ) {
        Image(
            painter = painterResource(id = repo.img),
            contentDescription = null,
            modifier.size(28.dp)
        )
        Column(
            modifier = modifier
                .padding(10.dp, 0.dp, 0.dp, 0.dp)

        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier.fillMaxWidth()
            )
            {
                Text(
                    text = repo.name,
                    maxLines = 1,
                    fontSize = 15.sp,
                    overflow = TextOverflow.Ellipsis,
                )
                Row {
                    Text(text = repo.rate.toString())
                    Spacer(modifier = modifier.width(8.dp))
                    Image(
                        painter = painterResource(id = R.drawable.star_icon),
                        contentDescription = null,
                        modifier.size(20.dp)
                    )
                }
            }
            Spacer(modifier = modifier.height(6.dp))
            Text(text = repo.owner)
            Spacer(modifier = modifier.height(8.dp))
            Text(text = repo.desc, fontWeight = FontWeight(400), fontSize = 17.sp)
        }
    }
}