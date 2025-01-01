package com.yousef.githubreposapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.yousef.githubreposapp.ui.theme.GitHubReposAppTheme

@Composable
fun IssueCard(modifier: Modifier = Modifier, issue: Issue) {

    Row(
        modifier = modifier
            .padding(0.dp, 8.dp, 0.dp, 0.dp)
            .clip(RoundedCornerShape(13.dp))
            .background(Color.White)
            .padding(10.dp)
    ) {
        Image(
            painter = painterResource(id = issue.img),
            contentDescription = null,
            modifier.size(28.dp)
        )
        Column(
            modifier = modifier
                .weight(1f)
                .padding(10.dp, 0.dp, 35.dp, 0.dp)

        ) {
            Text(
                text = "Issue ${issue.title}",
                maxLines = 1,
                fontWeight = FontWeight(700),
                fontSize = 18.sp,
                overflow = TextOverflow.Ellipsis,
            )
            Spacer(modifier = modifier.height(3.dp))
            Text(text = "NONE", color = Color.Gray)
            Spacer(modifier = modifier.height(3.dp))
            Row {
                Text(text = "Created At: ", fontWeight = FontWeight(800), fontSize = 15.sp)
                Text(text = issue.createdAt, color = Color.Gray, fontSize = 15.sp)
            }
        }
        Text(text = issue.state)

    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RepoItemPrev() {
    GitHubReposAppTheme {
        IssueCard(

            issue = Issue("donnas", "closed", "20200", R.drawable.ic_launcher_background)
        )
    }

}
