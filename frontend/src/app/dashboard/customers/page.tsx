import { customers } from "../../../../data/customers";

export default function CustomersPage() {
  return (
    <main className="p-6">
      <h1 className="text-2xl font-semibold">Clientes</h1>
      <p className="text-gray-500 mt-2 mb-6">Aquí listaremos clientes.</p>

      <div className="overflow-x-auto">
        <table className="min-w-full bg-white rounded-lg shadow border border-gray-200">
          <thead className="bg-gray-100 border-b">
            <tr>
              <th className="text-left p-3 text-sm font-medium text-gray-700">Cliente</th>
              <th className="text-left p-3 text-sm font-medium text-gray-700">Email</th>
              <th className="text-left p-3 text-sm font-medium text-gray-700">Estado</th>
            </tr>
          </thead>
          <tbody>
            {customers.map((c) => (
              <tr key={c.id} className="border-b hover:bg-gray-50">
                <td className="p-3 text-sm">{c.name}</td>
                <td className="p-3 text-sm">{c.email}</td>
                <td className="p-3 text-sm">
                  <span
                    className={`inline-flex items-center rounded-full px-2 py-0.5 text-xs ${
                      c.status === "Activo"
                        ? "bg-green-100 text-green-700"
                        : "bg-gray-200 text-gray-600"
                    }`}
                  >
                    {c.status}
                  </span>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </main>
  );
}
