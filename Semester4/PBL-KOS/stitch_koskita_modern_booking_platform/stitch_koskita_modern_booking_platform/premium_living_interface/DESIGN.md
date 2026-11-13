---
name: Premium Living Interface
colors:
  surface: '#faf9fe'
  surface-dim: '#dad9df'
  surface-bright: '#faf9fe'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f4f3f8'
  surface-container: '#eeedf2'
  surface-container-high: '#e8e7ed'
  surface-container-highest: '#e3e2e7'
  on-surface: '#1a1b1f'
  on-surface-variant: '#43474f'
  inverse-surface: '#2f3034'
  inverse-on-surface: '#f1f0f5'
  outline: '#747781'
  outline-variant: '#c4c6d1'
  surface-tint: '#405e96'
  primary: '#012a60'
  on-primary: '#ffffff'
  primary-container: '#214177'
  on-primary-container: '#91aeec'
  inverse-primary: '#adc6ff'
  secondary: '#535f72'
  on-secondary: '#ffffff'
  secondary-container: '#d7e3fa'
  on-secondary-container: '#596578'
  tertiary: '#452400'
  on-tertiary: '#ffffff'
  tertiary-container: '#643700'
  on-tertiary-container: '#e2a163'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#d8e2ff'
  primary-fixed-dim: '#adc6ff'
  on-primary-fixed: '#001a41'
  on-primary-fixed-variant: '#27467c'
  secondary-fixed: '#d7e3fa'
  secondary-fixed-dim: '#bbc7dd'
  on-secondary-fixed: '#101c2c'
  on-secondary-fixed-variant: '#3c475a'
  tertiary-fixed: '#ffdcbf'
  tertiary-fixed-dim: '#fdb878'
  on-tertiary-fixed: '#2d1600'
  on-tertiary-fixed-variant: '#6a3c04'
  background: '#faf9fe'
  on-background: '#1a1b1f'
  surface-variant: '#e3e2e7'
typography:
  display-xl:
    fontFamily: Poppins
    fontSize: 48px
    fontWeight: '700'
    lineHeight: '1.1'
    letterSpacing: -0.02em
  display-lg:
    fontFamily: Poppins
    fontSize: 32px
    fontWeight: '600'
    lineHeight: '1.2'
    letterSpacing: -0.01em
  h1:
    fontFamily: Poppins
    fontSize: 24px
    fontWeight: '600'
    lineHeight: '1.3'
  h2:
    fontFamily: Poppins
    fontSize: 20px
    fontWeight: '600'
    lineHeight: '1.4'
  body-lg:
    fontFamily: Inter
    fontSize: 18px
    fontWeight: '400'
    lineHeight: '1.6'
  body-md:
    fontFamily: Inter
    fontSize: 16px
    fontWeight: '400'
    lineHeight: '1.5'
  body-sm:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '400'
    lineHeight: '1.5'
  label-caps:
    fontFamily: Inter
    fontSize: 12px
    fontWeight: '600'
    lineHeight: '1'
    letterSpacing: 0.05em
rounded:
  sm: 0.5rem
  DEFAULT: 1rem
  md: 1.5rem
  lg: 2rem
  xl: 3rem
  full: 9999px
spacing:
  unit: 4px
  container-max: 1440px
  gutter: 24px
  margin-page: 48px
  stack-sm: 12px
  stack-md: 24px
  stack-lg: 48px
---

## Brand & Style
The design system embodies a premium, editorial-inspired aesthetic for modern property management. It prioritizes clarity and calm, using extensive whitespace to reduce the cognitive load associated with real estate logistics. 

The style is characterized by a "Soft Premium" approach—merging high-end corporate reliability with a welcoming, hospitality-focused warmth. Key visual pillars include large-radius surfaces, subtle depth through layered shadows, and a sophisticated monochromatic foundation accented by a deep, authoritative navy.

## Colors
This design system utilizes a high-contrast primary palette supported by soft, tonal accents. 

- **Primary Blue (#214177):** Used for core branding, primary actions, and active states to project trust and stability.
- **Soft Blue (#DCE8FF):** Acts as a high-light surface for backgrounds of active components or secondary buttons.
- **Semantic Colors:** Green, Orange, and Red are reserved strictly for status communication (occupancy, late payments, maintenance alerts).
- **Grayscale:** The background (#F5F7FB) is slightly cool-toned to maintain a fresh, modern feel, while #111827 provides maximum legibility for body and heading content.

## Typography
The system employs a dual-font strategy. **Poppins** is utilized for all display and heading levels to provide a geometric, modern, and slightly friendly character. **Inter** is the workhorse for all UI elements, data tables, and body copy, chosen for its exceptional legibility and neutral tone. 

Use `display-xl` sparingly for marketing hero sections. For dashboard interfaces, prioritize `h1` and `body-md`. Data-heavy labels should use the `label-caps` style to differentiate from interactive text.

## Layout & Spacing
This design system follows a 12-column fluid grid for main content areas, with a maximum container width of 1440px. 

- **Whitespace:** Use generous margins (48px) to frame the content, creating an "exclusive" gallery-like feel.
- **Rhythm:** Spacing is based on a 4px baseline. Components should be separated by increments of 24px (gutter) to maintain consistent vertical rhythm.
- **Alignment:** Navigation and sidebar elements should align to the page margin, while internal card content utilizes a 24px internal padding.

## Elevation & Depth
Depth is created through ambient, multi-layered shadows rather than harsh borders. 

- **Level 1 (Subtle):** Used for static cards and input fields. `0px 4px 20px rgba(0, 0, 0, 0.03)`.
- **Level 2 (Active):** Used for hover states and navigation bars. `0px 10px 30px rgba(33, 65, 119, 0.08)`.
- **Level 3 (Overlay):** Used for modals and dropdowns. `0px 20px 50px rgba(0, 0, 0, 0.12)`.

Surfaces should primarily be White (#FFFFFF) against the Background (#F5F7FB), creating a clear "stacked" hierarchy without needing heavy strokes.

## Shapes
The shape language is extremely soft and approachable. 
- **Large Components:** Property cards and main dashboard containers use a **32px** radius.
- **Standard UI:** Buttons use a full **pill-shape** (50px+) to emphasize their interactivity and modern feel.
- **Form Elements:** Inputs and smaller widgets use a **16px** radius to balance the "roundness" without losing functional space.

## Components

### Navigation & Sidebars
- **Navbar:** Floating white container with `radius-button` and Level 2 elevation. Icons should be 24px linear strokes.
- **Sidebars:** Persistent left-aligned panels with a light gray separator or tonal background. Active states use the Soft Blue (#DCE8FF) with a Primary Blue vertical indicator.

### Buttons
- **Primary:** Primary Blue background, White text, pill-shaped.
- **Secondary:** Soft Blue background, Primary Blue text.
- **Ghost:** No background, Primary Blue or Gray text, appears on hover with a subtle gray tint.

### Property Cards
- **Structure:** 32px rounded corners on the container. Images should have a 24px inner radius. 
- **Details:** Price in Poppins H2; wishlist (heart icon) floating in the top right corner of the image with a glassmorphic background.

### Form Inputs
- **Floating Labels:** Labels sit inside the 16px rounded border, shrinking and moving to the top edge on focus.
- **States:** Focus state uses a 2px Primary Blue border and a subtle Soft Blue outer glow.

### Data & Tables
- **Tables:** Rows should be separated by whitespace and subtle background shifts rather than lines. Each row is a 12px rounded surface.
- **Charts:** Use Primary Blue and Success Green for trend lines. Hide grid lines to maintain the minimalist aesthetic.

### Drag & Drop Upload
- **Design:** Dotted border in Gray Text color, 24px radius. Use a large "Cloud" icon in Primary Blue and a bold call-to-action link.