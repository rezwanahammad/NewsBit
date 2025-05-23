# NewsBit Android App

An Android application built with Java that aggregates and displays news articles fetched from the [newsapi.org](https://newsapi.org) service. Users can register, log in, and browse news across various categories.

## Features

*   **User Authentication:** Secure user registration and login functionality using Firebase Authentication.
*   **Categorized News:** News articles are organized into tabs for easy navigation:
    *   Home (Top Headlines)
    *   Science
    *   Health
    *   Technology
    *   Entertainment
    *   Sports
*   **Article Display:** Articles are presented in a list format, with images loaded using Glide.
*   **User Logout:** Authenticated users can log out of the application.
*   **Splash Screen:** A simple splash screen is displayed upon app launch.

## Tech Stack

*   **Language:** Java
*   **Core Libraries & Architecture:**
    *   Android SDK (Min SDK 23, Target SDK 34)
    *   AndroidX Libraries (AppCompat, ConstraintLayout, etc.)
    *   Material Components for UI
    *   View Binding
    *   Fragments for modular UI components
    *   RecyclerView for efficient list display
    *   ViewPager and TabLayout for tabbed navigation
*   **Networking:**
    *   Retrofit: For making API calls to `newsapi.org`.
    *   Glide: For loading and caching images.
*   **Authentication:**
    *   Firebase Authentication: For handling user sign-up and sign-in.

## Setup and Build

1.  **Clone the repository:**
    ```bash
    git clone <repository_url>
    cd <repository_directory>
    ```
2.  **API Key for newsapi.org:**
    This project uses `newsapi.org` to fetch news articles. An API key is required to use their service.
    *   **Current API Key (for evaluation/testing only):** `1986db20cc1b4dd583ac779156575885`
        *   This key is currently hardcoded in `app/src/main/java/com/example/newsbit/MainActivity.java` and `app/src/main/java/com/example/newsbit/HomeFragment.java`.

3.  **Firebase Setup:**
    *   This project is configured to use Firebase Authentication.
    *   To connect it to your own Firebase project:
        1.  Go to the [Firebase Console](https://console.firebase.google.com/).
        2.  Create a new Firebase project (or use an existing one).
        3.  Add an Android app to your Firebase project with the package name `com.example.newsbit`.
        4.  Download the `google-services.json` file provided by Firebase.
        5.  Place the `google-services.json` file in the `app/` directory of this project.
        6.  Enable Email/Password sign-in provider in Firebase Console under Authentication > Sign-in method.

4.  **Build and Run:**
    *   Open the project in Android Studio.
    *   Allow Gradle to sync and download dependencies.
    *   Run the app on an emulator or a physical device.

## Screenshots & Screenrecoder of the app

https://github.com/user-attachments/assets/de8b3f4a-6e0e-4fa7-bf57-bcd1ab16f979


*(Placeholder for screenshots of the app - e.g., Login screen, Main news feed, Category tabs)*
![p1](https://github.com/user-attachments/assets/45c90c33-d909-4c62-85d4-ed847182ca03)
![p2](https://github.com/user-attachments/assets/0ea9f242-9519-4467-affe-8533c4328be0)
![p3](https://github.com/user-attachments/assets/a9cdd5d0-e4e8-44c6-bddd-262f90bbfac3)
![p4](https://github.com/user-attachments/assets/945c76a2-5b8b-4e7d-900a-24533b7f91db)
![p5](https://github.com/user-attachments/assets/dda81be7-4833-49b9-974e-5c4c16778d2a)
![p6](https://github.com/user-attachments/assets/26d57712-699c-4b4b-a559-84208a9fa9c2)


