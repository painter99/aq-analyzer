# PoC — DR14 validation prototype

Before the Android app exists, the DR14 measurement core is validated directly
on a phone via **Termux**, using the reference Python implementation
([dr14meter](https://github.com/simon-r/dr14_t.meter)) and cross-checked
against desktop reference results (foobar2000 + foo_dr_meter).

## Reference material

Validation runs against a set of known reference masters (hi-res FLAC) with
previously verified DR values. Titles and expected values are kept private
for now — what matters is that the implementation matches the reference
tools, not which albums are used.

## Method

1. Compute DR per track with dr14meter in Termux
2. Compare against foo_dr_meter reference output
3. The Kotlin implementation (app core) must match within ±0 DR per track

The Kotlin DR14 core implements both the foo_dr_meter and dr14meter variants
(shared base, different peak/RMS strategies) with three precision levels
(rounded / 0.1 dB / raw).
