import React from "react";

export default function DashboardLayout({ children }: { children: React.ReactNode }) {
  return (
    <div className="flex min-h-screen">

      {/* Sidebar */}
      <aside className="w-64 bg-gray-100 border-r p-4">
        <h2 className="text-xl font-semibold mb-6">Panel</h2>

        <nav className="space-y-2 text-sm">
          <a
            className="block text-gray-700 hover:text-black"
            href="/dashboard"
          >
            Resumen
          </a>

          <a
            className="block text-gray-700 hover:text-black"
            href="/dashboard/invoices"
          >
            Facturas
          </a>

          <a
            className="block text-gray-700 hover:text-black"
            href="/dashboard/customers"
          >
            Clientes
          </a>
        </nav>
      </aside>

      {/* Contenido principal */}
      <main className="flex-1 p-8">
        {children}
      </main>
    </div>
  );
}
