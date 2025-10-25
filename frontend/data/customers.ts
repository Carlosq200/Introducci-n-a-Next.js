export type Customer = {
  id: string;
  name: string;
  email: string;
  status: 'Activo' | 'Inactivo';
};

export const customers: Customer[] = [
  { id: 'c001', name: 'Juan Pérez',    email: 'juan@example.com',    status: 'Activo'   },
  { id: 'c002', name: 'María García',  email: 'maria@example.com',   status: 'Inactivo' },
  { id: 'c003', name: 'Luis Díaz',     email: 'luis@example.com',    status: 'Activo'   },
  { id: 'c004', name: 'Ana López',     email: 'ana@example.com',     status: 'Activo'   },
  { id: 'c005', name: 'Pedro Rojas',   email: 'pedro@example.com',   status: 'Inactivo' },
];
