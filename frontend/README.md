# Dashboard App (Next.js 16 + TypeScript + Tailwind)

Este proyecto es un clon simple de un panel administrativo (dashboard) basado en el curso oficial de Next.js:
https://nextjs.org/learn/dashboard-app

## Tecnologías usadas
- Next.js 16 (App Router / carpeta \pp\)
- React con componentes Server
- TypeScript
- Tailwind CSS
- Turbopack (dev)
- Rutas anidadas bajo \/dashboard\

## Estructura principal del frontend
\\\
frontend/
  src/app/page.tsx                   -> página pública inicial "Landing"
  src/app/dashboard/layout.tsx       -> layout compartido con sidebar y header
  src/app/dashboard/page.tsx         -> resumen general del panel
  src/app/dashboard/invoices/page.tsx -> tabla de facturas
  src/app/dashboard/customers/page.tsx -> tabla de clientes
  data/
    invoices.ts                      -> datos mock (facturas)
    customers.ts                     -> datos mock (clientes)
\\\

## Funcionalidades implementadas
1. **Layout global del dashboard**
   - Sidebar con navegación ("Resumen", "Facturas", "Clientes")
   - Área principal con título y contenido
   - Estilos con Tailwind

2. **Página /dashboard**
   - Texto de bienvenida (aquí irían KPIs, charts, etc.)

3. **Página /dashboard/invoices**
   - Tabla con facturas mock
   - Cada factura incluye id, cliente, monto, estado, fecha

4. **Página /dashboard/customers**
   - Tabla con clientes mock
   - Cada cliente incluye id, nombre, email y estado ("Activo" / "Inactivo")
   - Badges de color verde/gris según estado

5. **Tipado con TypeScript**
   - Tipos \Invoice\ e \Customer\
   - Datos tipados en \/frontend/data/*.ts\

6. **Build de producción**
   - \
pm run build\ se ejecutó correctamente
   - Se generan páginas estáticas para:
     - \/\
     - \/dashboard\
     - \/dashboard/invoices\
     - \/dashboard/customers\
     - \/not-found\

## Cómo correr el proyecto (dev)
1. Ir al directorio del frontend:
   \\\ash
   cd frontend
   \\\

2. Instalar dependencias:
   \\\ash
   npm install
   \\\

3. Levantar modo desarrollo:
   \\\ash
   npm run dev
   \\\
   Por defecto se abre en http://localhost:3000

## Cómo generar el build de producción
1. Desde \rontend\:
   \\\ash
   npm run build
   \\\

2. (Opcional) Servir el build:
   \\\ash
   npm start
   \\\

## Estado actual
- 💯 Rutas creadas, layout hecho, datos mock renderizando OK
- ✅ Build de producción exitoso
- 📦 Listo para revisión / entrega

---
Autor: Carlos
