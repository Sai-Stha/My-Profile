# My Profile App

A Flutter app with multiple build flavors (dev, staging, prod) displaying my name and photo on the home screen.

## Flavors

This project uses `flutter_flavorizr` to manage three build flavors:

- **dev** – Development build, shows a green flavor banner
- **staging** – Staging build, shows a green flavor banner
- **prod** – Production build, also shows the flavor banner (debug mode)

Each flavor has distinct app name shown on the home screen and in the app switcher.

## Setup

```bash
flutter pub get
dart run flutter_launcher_icons
dart run flutter_flavorizr
```

## Running Each Flavor

**Dev:**
```bash
flutter run --flavor dev --dart-define=appFlavor=dev
```

**Staging:**
```bash
flutter run --flavor staging --dart-define=appFlavor=staging
```

**Prod:**
```bash
flutter run --flavor prod --dart-define=appFlavor=prod
```

## Notes

Each flavor displays its name on the home screen (e.g. "MyApp Dev") along with profile photo and name.