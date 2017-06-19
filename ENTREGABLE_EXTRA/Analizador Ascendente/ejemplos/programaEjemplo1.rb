def decir_adios
  if @nombres.nil?
    puts "..."
  elsif @nombres.respond_to?("join")
    puts "Adiós #{@nombres.join(", ")}. Vuelvan pronto."
  else
    puts "Adiós #{@nombres}. Vuelve pronto."
  end
end
