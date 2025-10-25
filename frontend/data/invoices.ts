export type Invoice = {
  id: string;
  customer: string;
  amount: number;
  status: "paid" | "pending" | "overdue";
  date: string; // ISO string
};

export const invoices: Invoice[] = [
  {
    id: "INV-001",
    customer: "Juan Perez",
    amount: 320.5,
    status: "paid",
    date: "2025-01-10",
  },
  {
    id: "INV-002",
    customer: "ACME S.A.",
    amount: 1200,
    status: "pending",
    date: "2025-01-15",
  },
  {
    id: "INV-003",
    customer: "Maria Lopez",
    amount: 540,
    status: "overdue",
    date: "2025-01-20",
  },
];
