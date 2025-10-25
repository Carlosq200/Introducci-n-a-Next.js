import { customers } from '@/data/customers';

export default function CustomersPage() {
  return (
    <main className="p-6">
      <h1 className="text-2xl font-semibold">Clientes</h1>
      <p className="text-gray-500 mt-2 mb-6">
        Lista de clientes registrados.
      </p>

      <table className="min-w-full bg-white border">
        <thead className="bg-gray-100 border-b">
          <tr>
            <th className="text-left p-2 border-r">Cliente</th>
            <th className="text-left p-2 border-r">Email</th>
            <th className="text-left p-2">Estado</th>
          </tr>
        </thead>
        <tbody>
          {customers.map((c) => (
            <tr key={c.id} className="border-b">
              <td className="p-2 border-r">{c.name}</td>
              <td className="p-2 border-r">{c.email}</td>
              <td className="p-2">{c.status}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </main>
  );
}
