---
name: Serene Habitat
colors:
  surface: '#faf9fd'
  surface-dim: '#dad9de'
  surface-bright: '#faf9fd'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f4f3f7'
  surface-container: '#eeedf2'
  surface-container-high: '#e8e7ec'
  surface-container-highest: '#e3e2e6'
  on-surface: '#1a1c1f'
  on-surface-variant: '#43474f'
  inverse-surface: '#2f3034'
  inverse-on-surface: '#f1f0f4'
  outline: '#747780'
  outline-variant: '#c3c6d0'
  surface-tint: '#405f8e'
  primary: '#1f406d'
  on-primary: '#ffffff'
  primary-container: '#395886'
  on-primary-container: '#b3cfff'
  inverse-primary: '#a9c8fc'
  secondary: '#325f99'
  on-secondary: '#ffffff'
  secondary-container: '#93bdfe'
  on-secondary-container: '#194c85'
  tertiary: '#18416d'
  on-tertiary: '#ffffff'
  tertiary-container: '#345986'
  on-tertiary-container: '#afd0ff'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#d5e3ff'
  primary-fixed-dim: '#a9c8fc'
  on-primary-fixed: '#001b3c'
  on-primary-fixed-variant: '#274774'
  secondary-fixed: '#d4e3ff'
  secondary-fixed-dim: '#a5c8ff'
  on-secondary-fixed: '#001c3a'
  on-secondary-fixed-variant: '#124780'
  tertiary-fixed: '#d3e4ff'
  tertiary-fixed-dim: '#a5c9fc'
  on-tertiary-fixed: '#001c38'
  on-tertiary-fixed-variant: '#214874'
  background: '#faf9fd'
  on-background: '#1a1c1f'
  surface-variant: '#e3e2e6'
typography:
  h1:
    fontFamily: Plus Jakarta Sans
    fontSize: 48px
    fontWeight: '700'
    lineHeight: '1.2'
    letterSpacing: -0.02em
  h2:
    fontFamily: Plus Jakarta Sans
    fontSize: 36px
    fontWeight: '700'
    lineHeight: '1.2'
    letterSpacing: -0.01em
  h3:
    fontFamily: Plus Jakarta Sans
    fontSize: 24px
    fontWeight: '600'
    lineHeight: '1.3'
  body-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 18px
    fontWeight: '400'
    lineHeight: '1.6'
  body-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 16px
    fontWeight: '400'
    lineHeight: '1.6'
  body-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 14px
    fontWeight: '400'
    lineHeight: '1.5'
  label-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 14px
    fontWeight: '600'
    lineHeight: '1.0'
    letterSpacing: 0.02em
  label-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 12px
    fontWeight: '500'
    lineHeight: '1.0'
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  unit: 8px
  container-max: 1280px
  gutter: 24px
  margin-mobile: 16px
  margin-desktop: 40px
  stack-xs: 4px
  stack-sm: 8px
  stack-md: 16px
  stack-lg: 32px
  stack-xl: 64px
---

## Brand & Style

This design system is built to evoke a sense of "Calm Reliability." Targeting urban professionals and students seeking high-quality long-term housing, the aesthetic prioritizes clarity and peace of mind over visual noise. 

The design style is **Modern Minimalist with Glassmorphic Accents**. It leverages the breathing room of heavy whitespace combined with the sophisticated depth of translucent layers. By merging a professional corporate structure with soft, organic visual elements, the system achieves a trustworthy yet approachable personality. The experience should feel as effortless as a high-end travel booking platform, reducing the stress of finding a home through balanced compositions and a soothing visual rhythm.

## Colors

The palette is monochromatic-adjacent, utilizing varying depths of blue to create a cohesive, aquatic-like serenity. 

*   **Primary (#395886):** Used for critical actions, branding, and primary navigation states to establish authority.
*   **Accents:** These shades provide hierarchy within interactive elements and help categorize different levels of information without introducing jarring hues.
*   **Backgrounds:** A soft, off-white blue (`#F0F3FA`) serves as the canvas, while `#D5DEEF` is reserved for subtle card borders or secondary container backgrounds to provide depth without high contrast.
*   **Functional Colors:** Use standard semantic success (green) and error (red) colors, but desaturate them slightly to remain consistent with the soft aesthetic.

## Typography

The design system utilizes **Plus Jakarta Sans** for its friendly yet professional geometry. Its soft terminals and open counters make it exceptionally readable in both high-density listings and large hero headlines.

Headlines should use tighter letter spacing and heavier weights to feel "grounded." Body text maintains a generous line height (1.6) to ensure long-form property descriptions are easy to digest. Use weight variations (Medium vs Regular) to create hierarchy in metadata labels rather than relying solely on color changes.

## Layout & Spacing

This design system employs a **12-column fluid grid** for desktop and a **4-column fluid grid** for mobile. The layout philosophy is centered on "The 8pt Grid," where all margins, paddings, and heights are multiples of 8px.

Whitespace is used aggressively to separate content groups, particularly in property detail pages. Large vertical stacks (64px+) should be used between major sections like "Property Features" and "Location Map" to prevent visual fatigue. Horizontal spacing between cards should remain consistent at 24px to allow the soft shadows to breathe without overlapping.

## Elevation & Depth

Hierarchy is established through **Ambient Shadows** and **Glassmorphism**. 

1.  **Level 0 (Base):** The main background (`#F0F3FA`).
2.  **Level 1 (Cards/Surface):** White surfaces with extremely diffused, low-opacity shadows (Blur: 30px, Y: 10, Opacity: 4% of Primary Color).
3.  **Level 2 (Glassmorphic Overlays):** Used for navigation bars and floating buttons. These elements utilize a background blur of 12px-20px and a 60% opacity white fill, finished with a subtle 1px white border at 20% opacity.
4.  **Interaction:** Upon hover, cards should subtly lift by increasing shadow spread and reducing the Y-offset, creating a "magnetic" feel.

## Shapes

The shape language is defined by large, approachable radii. 
*   **Standard Containers:** Use 1rem (16px) corners for property cards and modals.
*   **Buttons & Chips:** Use 2rem (32px) or full pill-shaping to distinguish interactive elements from structural containers.
*   **Form Inputs:** Use 0.75rem (12px) to maintain a professional look while remaining consistent with the overall softness.

Avoid sharp 90-degree angles entirely, as they conflict with the "calm and trustworthy" brand personality.

## Components

*   **Buttons:** Primary buttons use a solid `#395886` fill with white text. Secondary buttons use a `#B1C9EF` background at 30% opacity with primary colored text for a "ghost-fill" look.
*   **Cards:** Property cards must feature a light glassmorphic footer for the price/title overlaying the property image. Shadows should be soft and tinted with the primary blue rather than pure black.
*   **Inputs:** Use a subtle background fill (`#D5DEEF` at 40% opacity) with a 1px outline that darkens to the primary color on focus.
*   **Chips/Tags:** Used for amenities (e.g., "WiFi," "AC"). Use a pill shape with a light blue background and dark blue text. Icons should be 2px weight outlines.
*   **Icons:** Use 24px grid-aligned outline icons with rounded caps. Do not use filled icons unless it is an active state (e.g., a "saved" heart).
*   **Search Bar:** A prominent, high-elevation floating component with a pill shape, often utilizing the glassmorphism effect when scrolled.