package com.yousef.githubreposapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
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
    private val repoList: List<Repo> = listOf(
        Repo(
            "java script",
            "saif mohamed",
            "This a lsuads advocmad advka dsav avds",
            R.drawable.ic_github_placeholser,
            15000
        ),
        Repo(
            name = "Ruby",
            owner = "ruby",
            desc = "Mona sdk mode to send notify",
            img = R.drawable.ic_github_placeholser,
            rate = 20981,
        ),

        Repo(
            "java script",
            "saif mohamed",
            "This a lsuads advocmad advka dsav avds",
            R.drawable.ic_github_placeholser,
            15000
        ),

        Repo(
            name = "Dart",
            owner = "google",
            desc = "Tha language for flutter framework",
            img = R.drawable.ic_github_placeholser,
            rate = 20981,
        ),
        Repo(
            name = "Ruby",
            owner = "ruby",
            desc = "Mona sdk mode to send notify",
            img = R.drawable.ic_github_placeholser,
            rate = 20981,
        ),

        )
    private val modifier: Modifier = Modifier

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun Test() {
        GitHubReposAppTheme {
            Scaffold(
                containerColor = Color(0xffECEDED),
                topBar = {
                    TopAppBar(
                        title = {
                            Text(
                                text = "Github Repositories",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight(700)
                            )
                        },
                    )
                }
            ) { paddingValues ->
                LazyColumn(
                    contentPadding = paddingValues,
                    modifier = Modifier
                        .padding(10.dp, 0.dp)

                ) {
                    items(repoList.size) { index ->
                        RepoCard(repo = repoList[index])
                    }
                }
            }
        }


    }
}


// Todo: Repo View
//GitHubReposAppTheme {
//    Scaffold(
//        containerColor = Color(0xffECEDED),
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text(
//                        text = "Github Repositories",
//                        modifier = Modifier.fillMaxWidth(),
//                        textAlign = TextAlign.Center,
//                        fontWeight = FontWeight(700)
//                    )
//                },
//            )
//        }
//    ) { paddingValues ->
//        LazyColumn(
//            contentPadding = paddingValues,
//            modifier = Modifier
//                .padding(10.dp, 0.dp)
//
//        ) {
//            items(repoList.size) { index ->
//                RepoCard(repo = repoList[index])
//            }
//        }
//    }
//}

// Todo: Issue View

//        GitHubReposAppTheme {
//            Scaffold(
//                containerColor = Color(0xffECEDED),
//                topBar = {
//                    TopAppBar(
//                        title = {
//                            Text(
//                                text = "Issues",
//                                modifier = Modifier.fillMaxWidth(),
//                                textAlign = TextAlign.Center,
//                                fontWeight = FontWeight(700)
//                            )
//                        },
//                        navigationIcon = {
//                            IconButton(onClick = { }) {
//                                Icon(
//                                    imageVector = Icons.Default.ArrowBack,
//                                    contentDescription = "icon back"
//                                )
//                            }
//                        },
//
//                        )
//                }
//            ) { paddingValues ->
//                LazyColumn(
//                    contentPadding = paddingValues,
//                    modifier = Modifier
//                        .padding(10.dp, 0.dp)
//
//                ) {
//                    items(issuesList.size) { index ->
//                        IssueCard(issue = issuesList[index])
//                    }
//                }
//            }
//        }

//TODO : Details view
//GitHubReposAppTheme {
//    Scaffold(
//        containerColor = Color(0xffECEDED),
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text(
//                        text = "Details",
//                        modifier = Modifier.fillMaxWidth(),
//                        textAlign = TextAlign.Center,
//                        fontWeight = FontWeight(700)
//                    )
//                },
//                navigationIcon = {
//                    IconButton(onClick = { }) {
//                        Icon(
//                            imageVector = Icons.Default.ArrowBack,
//                            contentDescription = "icon back"
//                        )
//                    }
//                },
//
//                )
//        }
//    ) { paddingValues ->
//
//        Column(
//            modifier
//                .padding(paddingValues)
//                .padding(vertical = 20.dp)
//                .fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.ic_github_placeholser),
//                contentDescription = null,
//                modifier.size(150.dp)
//            )
//            Spacer(modifier.height(20.dp))
//
//            Text(text = repoList[0].name, fontWeight = FontWeight(600), fontSize = 22.sp)
//
//            Spacer(modifier.height(20.dp))
//            Row(
//                horizontalArrangement = Arrangement.SpaceBetween,
//            ) {
//                Row {
//                    Text(text = repoList[0].rate.toString())
//                    Spacer(modifier = modifier.width(3.dp))
//                    Image(
//                        painter = painterResource(id = R.drawable.star_icon),
//                        contentDescription = null,
//                        modifier.size(20.dp)
//                    )
//                }
//                Spacer(modifier = modifier.width(10.dp))
//                Row {
//                    Text(text = repoList[0].rate.toString())
//                    Spacer(modifier = modifier.width(3.dp))
//                    Image(
//                        painter = painterResource(id = R.drawable.ic_issues),
//                        contentDescription = null,
//                        modifier.size(20.dp)
//                    )
//                }
//                Spacer(modifier = modifier.width(10.dp))
//                Row {
//                    Text(text = repoList[0].rate.toString())
//                    Spacer(modifier = modifier.width(3.dp))
//                    Image(
//                        painter = painterResource(id = R.drawable.ic_fork),
//                        contentDescription = null,
//                        modifier.size(20.dp)
//                    )
//                }
//            }
//
//            Spacer(modifier.height(20.dp))
//
//            Text(text = repoList[1].desc)
//
//            Spacer(modifier = modifier.weight(1f))
//
//
//            Button(
//                onClick = {},
//                shape = RoundedCornerShape(8.dp),
//                modifier = modifier.width(180.dp),
//
//                ) {
//                Text(text = "Show Issues")
//            }
//
//        }
//    }
//}
