import { invoices } from "../../../data/invoices";

export default function InvoicesPage() {
  return (
    <main className="p-6 space-y-4">
      <h1 className="text-2xl font-semibold">Facturas</h1>
      <p className="text-gray-500">
        Lista de facturas mock (aún sin backend real).
      </p>

      <table className="w-full text-left border border-gray-200 text-sm">
        <thead className="bg-gray-50">
          <tr>
            <th className="px-3 py-2 border-b">ID</th>
            <th className="px-3 py-2 border-b">Cliente</th>
            <th className="px-3 py-2 border-b">Monto</th>
            <th className="px-3 py-2 border-b">Estado</th>
            <th className="px-3 py-2 border-b">Fecha</th>
          </tr>
        </thead>
        <tbody>
          {invoices.map((inv) => (
            <tr key={inv.id} className="odd:bg-white even:bg-gray-50">
              <td className="px-3 py-2 border-b">{inv.id}</td>
              <td className="px-3 py-2 border-b">{inv.customer}</td>
              <td className="px-3 py-2 border-b">
                ${"{"}inv.amount.toFixed(2){"}"} USD
              </td>
              <td className="px-3 py-2 border-b">{inv.status}</td>
              <td className="px-3 py-2 border-b">{inv.date}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </main>
  );
}
