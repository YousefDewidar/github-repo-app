package com.yousef.githubreposapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yousef.githubreposapp.ui.theme.GitHubReposAppTheme

class MainActivity : ComponentActivity() {
    private val issuesList: List<Issue> = listOf(
        Issue(
            title = "Login Screen Bug",
            state = "Open",
            createdAt = "2024-12-18",
            img = R.drawable.ic_launcher_background
        ),
        Issue(
            title = "Crash in Settings",
            state = "Closed",
            createdAt = "2024-12-17",
            img = R.drawable.ic_launcher_background
        ),
        Issue(
            title = "UI Glitch in Home Screen",
            state = "Open",
            createdAt = "2024-12-16",
            img = R.drawable.ic_launcher_background
        ),
        Issue(
            title = "Performance Lag in Profile",
            state = "Closed",
            createdAt = "2024-12-15",
            img = R.drawable.ic_launcher_background
        ),
        Issue(
            title = "Notifications Not Working",
            state = "Open",
            createdAt = "2024-12-14",
            img = R.drawable.ic_launcher_background
        ),
        Issue(
            title = "Error on Data Sync",
            state = "Closed",
            createdAt = "2024-12-13",
            img = R.drawable.ic_launcher_background
        ),
        Issue(
            title = "Slow Loading of Dashboard",
            state = "Open",
            createdAt = "2024-12-12",
            img = R.drawable.ic_launcher_background
        ),
        Issue(
            title = "Logout Function Failing",
            state = "Closed",
            createdAt = "2024-12-11",
            img = R.drawable.ic_launcher_background
        ),
        Issue(
            title = "Search Results Incorrect",
            state = "Open",
            createdAt = "2024-12-10",
            img = R.drawable.ic_launcher_background
        ),
        Issue(
            title = "Dark Mode UI Overlap",
            state = "Closed",
            createdAt = "2024-12-09",
            img = R.drawable.ic_launcher_background
        )
    )


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitHubReposAppTheme {
                Scaffold(
                    containerColor = Color(0xffECEDED),
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "Issues",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight(700)
                                )
                            },
                            navigationIcon = {
                                IconButton(onClick = { }) {
                                    Icon(
                                        imageVector = Icons.Default.ArrowBack,
                                        contentDescription = "icon back"
                                    )
                                }
                            },

                            )
                    }
                ) { paddingValues ->
                    LazyColumn(
                        contentPadding = paddingValues,
                        modifier = Modifier
                            .padding(10.dp, 0.dp)

                    ) {
                        items(issuesList.size) { index ->
                            RepoItem(issue = issuesList[index])
                        }
                    }
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Test() {

    val issuesList: List<Issue> =
        listOf(
            Issue(
                title = "Bug in Login Screen",
                state = "Open",
                createdAt = "2024-12-18",
                img = R.drawable.ic_launcher_background,
            ),
            Issue(
                title = "Crash on Settings",
                state = "Closed",
                createdAt = "2024-12-17",
                img = R.drawable.ic_launcher_background,
            )
        )


    GitHubReposAppTheme {
        Scaffold(
            containerColor = Color.White.copy(.9f),

            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "Issues",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight(700)
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "icon back"
                            )

                        }

                    },

                    )
            }
        ) { paddingValues ->
            LazyColumn(
                contentPadding = paddingValues,
                modifier = Modifier
                    .padding(10.dp, 0.dp)

            ) {
                items(issuesList.size) { index ->
                    RepoItem(issue = issuesList[index])
                }
            }
        }
    }

}