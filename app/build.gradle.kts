plugins {
	id("com.android.application")
	id("org.jetbrains.kotlin.android")
	id("com.google.devtools.ksp")

}


android {
	namespace = "com.example.noteapp"
	compileSdk = 34

	defaultConfig {
		applicationId = "com.example.noteapp"
		minSdk = 24
		targetSdk = 34
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro"
			)
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}
	buildFeatures{
		viewBinding = true
	}

}

dependencies {

	implementation("androidx.core:core-ktx:1.13.1")
	implementation("androidx.appcompat:appcompat:1.7.0")
	implementation("com.google.android.material:material:1.12.0")
	implementation("androidx.constraintlayout:constraintlayout:2.1.4")
	implementation("androidx.room:room-common:2.6.1")
	testImplementation("junit:junit:4.13.2")
	androidTestImplementation("androidx.test.ext:junit:1.1.5")
	androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

	//Navigation
	val navVersion = "2.7.7"
	implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
	implementation("androidx.navigation:navigation-ui-ktx:$navVersion")

	//Lottie animasion
	val lottieVersion = "4.2.0"
	implementation ("com.airbnb.android:lottie:$lottieVersion")

	//Dots Indicator
	implementation ("com.tbuonomo:dotsindicator:4.3")

	//Room
	val roomVersion = "2.6.1"
	implementation("androidx.room:room-ktx:$roomVersion")
	kapt("androidx.room:room-compiler:$roomVersion")
}