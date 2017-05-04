def decir_adios
  if @nombres.nil?
    puts "..."
  elsif @nombres.respond_to?("join")
    # Juntar los elementos de la lista
    # usando la coma como separador.........

    =begin comentario multilinea.
    .
    .
    .
    .
    .
    .
    .
    .
    si asi es
    =end
    puts "Adiós #{@nombres.join(", ")}. Vuelvan pronto."
  else
    puts "Adiós #{@nombres}. Vuelve pronto."
  end
end
