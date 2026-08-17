# AQ Analyzer

**Offline audio mastering analysis for Android.** *(working name)*

AQ Analyzer is an Android app for audiophiles that performs professional-grade
technical analysis of audio files — 100% on-device. No cloud, no upload, no
account. Your music never leaves your phone.

## What it does

- **Dynamic Range (DR)** — DR14 algorithm (Pleasurize Music Foundation),
  implemented natively in Kotlin
- **Level metrics** — peak, true peak, RMS, integrated LUFS, loudness range
- **Full-track spectrogram** — visual inspection of the master
- **Fake lossless detection** — spots FLAC files secretly transcoded from MP3
  (brick-wall cut-off, upsampling)
- **Master comparison** — side-by-side analysis of two pressings of the same album

Reads local files (FLAC, WAV, ALAC, AIFF, MP3, AAC, OGG, OPUS) via the Android
file picker. Analysis of a typical hi-res track takes seconds.

## Why

Audiophiles today choose between cloud-based analyzers (privacy concerns,
upload required) and desktop tools (accurate, but not portable). AQ Analyzer
aims for desktop-grade accuracy in your pocket, fully offline.

## Status

**Early proof of concept.** The DR14 measurement core is being validated
against reference tools (foo_dr_meter, dr14meter) on known reference masters.
See [`poc/`](poc/) for the Termux-based prototype used for validation.

## Tech stack

| Layer | Technology |
|---|---|
| Language | Kotlin |
| UI | Jetpack Compose, Material 3 |
| Audio processing | FFmpegKit |
| Database | Room (SQLite) |
| Min Android | API 30 (Android 11) |

## Roadmap

1. **PoC** — single-file analysis: DR, levels, spectrogram
2. **MVP** — LUFS, fake-lossless detection, master comparison, history
3. **Premium** — on-device AI explanations of the analysis (English, offline)

## License

MIT — see [LICENSE](LICENSE).
