import Link from "next/link";

export default function HomePage() {
  return (
    <main className="p-6">
      <h1 className="text-2xl font-semibold">Acme Dashboard clone</h1>
      <p className="text-gray-500 mt-2">
        Este es el inicio. Entra al dashboard para ver datos.
      </p>

      <Link
        href="/dashboard"
        className="inline-block mt-4 rounded bg-black px-4 py-2 text-white hover:bg-gray-800"
      >
        Ir al Dashboard →
      </Link>
    </main>
  );
}
