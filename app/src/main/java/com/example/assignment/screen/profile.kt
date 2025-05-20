package com.example.assignment.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment.R

@Preview
@Composable
fun ProfileScreen() {
    Scaffold(
        topBar = {
            CustomTopAppBar(
                title = "Profile",
                onBackClick = {  },
                onSupportClick = { }
            )
        },
        containerColor = Color(0xFF1A1A1A)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {

            ProfileHeader()
            Spacer(modifier = Modifier.height(10.dp))

            SectionRow(
                icon = R.drawable.car,
                title = "get to know your vehicles, inside out",
                trailingText = null
            )


            Text(
                text = "CRED garage",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 32.dp)
            )

            Spacer(modifier = Modifier.height(26.dp))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { }
                    .padding(vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "credit score", color = Color.White, fontSize = 16.sp)
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "• REFRESH AVAILABLE", color = Color.Green, fontSize = 12.sp)
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "757", color = Color.White, fontSize = 16.sp)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.Default.ArrowForward, contentDescription = null, tint = Color.White)
            }
            Spacer(modifier = Modifier.height(26.dp))

            SectionRow(R.drawable.rupee, "lifetime cashback", "₹3")

            Spacer(modifier = Modifier.height(26.dp))
            SectionRow(R.drawable.arrow, "bank balance", "check")

            Spacer(modifier = Modifier.height(26.dp))

            Text(
                text = "YOUR REWARDS & BENEFITS",
                color = Color.Gray,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )


            SectionRow(null, "cashback balance", "₹0")

            Spacer(modifier = Modifier.height(26.dp))
            SectionRow(null, "coins", "26,46,583")

            Spacer(modifier = Modifier.height(26.dp))
            SectionRow(null, "win upto Rs 1000", "refer and earn")

            Spacer(modifier = Modifier.height(26.dp))

            Text(
                text = "TRANSACTIONS & SUPPORT",
                color = Color.Gray,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(26.dp))

            SectionRow(null, "all transactions", null)
        }
    }
}

@Composable
fun CustomTopAppBar(
    title: String,
    onBackClick: () -> Unit,
    onSupportClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1A1A1A))
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        IconButton(onClick = onBackClick) {
            Icon(
                painter = painterResource(id = R.drawable.arrow_back),
                contentDescription = "Back",
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.width(16.dp))


        Text(
            text = title,
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.weight(1f)
        )

/*
        Card(
            modifier = Modifier.clickable { onSupportClick() },
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        )*/
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = "Support",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "support",
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            }


    }
}

@Composable
fun ProfileHeader() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(bottom = 16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color.Gray)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = "andaz kumar",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "member since Dec, 2020",
                color = Color.Gray,
                fontSize = 14.sp
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { /* Edit */ }) {
            Icon(
                painter = painterResource(id = R.drawable.edit),
                contentDescription = "Edit",
                tint = Color.White
            )
        }
    }
}

@Composable
fun SectionRow(icon: Int?, title: String, trailingText: String?) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { }
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        icon?.let {
            Icon(
                painter = painterResource(id = it),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
        }

        Text(text = title, color = Color.White, fontSize = 16.sp)
        Spacer(modifier = Modifier.weight(1f))

        trailingText?.let {
            Text(text = it, color = Color.White, fontSize = 16.sp)
            Spacer(modifier = Modifier.width(8.dp))
        }

        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = null,
            tint = Color.White
        )
    }
}