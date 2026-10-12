package modelo;

public record Paquete(String guia, String destinatario, String destino, double peso) {
    public Paquete {
        if (guia == null || guia.isBlank()) {
            throw new IllegalArgumentException("La guia no puede estar vacia.");
        }
        if (destinatario == null || destinatario.isBlank()) {
            throw new IllegalArgumentException("El destinatario no puede estar vacio.");
        }
        if (destino == null || destino.isBlank()) {
            throw new IllegalArgumentException("El destino no puede estar vacio.");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0.");
        }
        guia = guia.trim().toUpperCase();
        destinatario = destinatario.trim();
        destino = destino.trim();
    }

    @Override
    public String toString() {
        return guia + " | " + destinatario + " | " + destino + " | " + peso + " kg";
    }
}
