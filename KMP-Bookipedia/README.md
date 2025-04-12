
Project Structure — KMP-Bookipedia


KMP-Bookipedia/
│
├── composeApp/
│   ├── androidMain/
│   │   ├── kotlin/
│   │   │   └── org.ajay.bookipedia/
│   │   │       ├── book.data.database/
│   │   │       ├── di/
│   │   │       ├── BookApplication.kt
│   │   │       └── MainActivity.kt
│   │   └── res/
│   │       └── AndroidManifest.xml
│   │
│   ├── commonMain/
│   │   ├── kotlin/
│   │   │   └── org.ajay.bookipedia/
│   │   │       ├── app/
│   │   │       ├── book/
│   │   │       │   ├── data/
│   │   │       │   │   ├── database/
│   │   │       │   │   ├── dto/
│   │   │       │   │   ├── mappers/
│   │   │       │   │   ├── network/
│   │   │       │   │   └── repository/
│   │   │       │   ├── domain/
│   │   │       │   │   ├── Book.kt
│   │   │       │   │   └── BookRepository.kt
│   │   │       │   └── presentation/
│   │   │       │       ├── book_detail/
│   │   │       │       ├── book_list/
│   │   │       │       └── SelectedBookViewModel.kt
│   │   │       ├── core/
│   │   │       │   ├── data/
│   │   │       │   ├── domain/
│   │   │       │   └── presentation/
│   │   │       └── di/
│   │   └── composeResources/
│
│   ├── iosMain/
│   │   ├── kotlin/
│   │   │   └── org.ajay.bookipedia/
│   │   │       ├── book.data.database/
│   │   │       ├── di/
│   │   │       └── MainViewController.kt
│
├── iosApp/
│   ├── Configuration/
│   ├── iosApp/
│   │   ├── Assets.xcassets/
│   │   ├── Preview Content/
│   │   ├── ContentView.swift
│   │   ├── Info.plist
│   │   └── IOSApp.swift
│   └── iosApp.xcodeproj/
│
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── local.properties
├── README.md
└── .gitignore
