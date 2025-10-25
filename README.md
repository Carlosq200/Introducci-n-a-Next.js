# Dashboard Next.js (ACME clone)

Proyecto base de dashboard construido con:
- Next.js 16 (App Router)
- TypeScript
- Tailwind CSS

## Qué incluye

- Layout compartido con sidebar y header fijo.
- Rutas protegidas del dashboard:
  - /dashboard
  - /dashboard/invoices
  - /dashboard/customers
- Navegación entre páginas usando <Link />.
- Tablas de datos (facturas y clientes) renderizadas en el lado del servidor a partir de datos mock locales.
- Flujo de trabajo profesional con ramas feature, pull requests y merge a \main\.

> Los datos de facturas y clientes vienen de archivos en \rontend/data/*.ts\.
> Esto simula la base de datos del curso sin necesidad de Postgres todavía.

## Cómo ejecutar

1. Ir al frontend:
   \\\powershell
   cd frontend
   npm install
   npm run dev
   \\\

2. Abrir en el navegador:
   - http://localhost:3000/dashboard
   - http://localhost:3000/dashboard/invoices
   - http://localhost:3000/dashboard/customers

Deberías ver:
- Página principal "Dashboard" con texto de bienvenida.
- Página "Invoices" con tabla de facturas.
- Página "Customers" con tabla de clientes y badges de estado ("Activo"/"Inactivo").

## Trabajo pendiente (siguientes capítulos del curso oficial Next.js)

- Conectar base de datos real (Postgres / Prisma).
- Fetch de datos real con Server Components.
- Paginación y buscador.
- Mutaciones (crear / editar registros) con Server Actions.
- Autenticación y protección de rutas.

Este repo ya cubre la parte de layout, rutas, navegación y tablas que corresponden a las primeras etapas del tutorial de Dashboard de Next.js. (Capítulos: Getting Started, Styling, Layouts/Pages, Navigation). :contentReference[oaicite:2]{index=2}
