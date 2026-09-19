# AQ Analyzer

**Audio Quality Analyzer** — an Android app for audiophiles that performs *professional-grade technical analysis of audio mastering quality*, 100% on-device. No cloud, no upload, no account.

## Features

| Feature | Description |
|---|---|
| Dynamic Range (DR) | DR14 algorithm (Pleasurize Music Foundation), implemented natively in Kotlin |
| Level metrics | peak, true peak, RMS, integrated LUFS, loudness range |
| Spectrogram | full-track spectrogram, visual inspection of the master |
| Fake lossless detection | spots FLAC files secretly transcoded from MP3 (brick-wall cut-off, upsampling) |
| Master comparison | side-by-side analysis of two pressings of the same album |

Reads local files (FLAC, WAV, ALAC, AIFF, MP3, AAC, OGG, OPUS) via the Android file picker.

## Status

Early proof of concept, Phase 1 (M1.x milestones). See roadmap below.

| Milestone | Scope | Status |
|---|---|---|
| M1.1 | Kotlin/Compose skeleton, forced dark theme, CI (tests + APK artifact) | ✅ |
| M1.2 | DR calculator per foo_dr_meter 1.0.8 spec (pure Kotlin, TDD) | planned |
| M1.3 | Audio decoder → PCM (FFmpegKit) | planned |
| M1.4 | File picker + metrics screen + history (Room) | planned |

The DR14 measurement core prototype lives in [`poc/`](poc/).

## Tech stack

Kotlin 2.0, Jetpack Compose (Material 3, forced dark theme), Hilt, KSP, Room, FFmpegKit (from M1.3).

## Build

```bash
./gradlew assembleDebug      # build
./gradlew testDebugUnitTest   # unit tests
```

Requires JDK 17 and Android SDK 35.

## License

MIT — see [LICENSE](LICENSE).
