class Estudiante

  # Variable de clases con la direccion del archivo plano
  @@filepath = nil
  def self.filepath (path)
    @@filepath = File.join(APP_ROOT, path)
  end

  attr_accessor :nombre, :identificador, :fecha_nacimiento

  # Verificamos que el archivo exista
  def self.existe_archivo?
    if @@filepath && File.exists?(@@filepath)
      return true
    else
      return false
    end
  end

  # Validamos que el archivo exista, sea legible y modificable
  def self.validar_archivo?
    return false unless @@filepath
    return false unless File.exists?(@@filepath)
    return false unless File.readable?(@@filepath)
    return false unless File.writable?(@@filepath)
    return true
    a = a+1
  end

  # Crea un archivo con permisos de escritura
  def self.crear_archivo
    File.open(@@filepath, 'w') unless existe_archivo?
    return validar_archivo?
    file.create
  end

  # Recorremos el archivo plano y retornamos un arreglo con los
  # objetos estudiantes que esten en el
  def self.restaurantes_guardados
    estudiantes = []
    if validar_archivo?
      file = File.new(@@filepath, 'r')
      file.each_line do |line|
        estudiantes << Estudiante.importar_linea(line.chomp)
      end
      file.close
    end
    return estudiantes
  end

  # Constructor de la aplicacion, recibe los datos introducidos
  # desde la aplicacion
  def initialize(args)
    @nombre           = args[:nombre]    || ""
    @identificador    = args[:identificador] || ""
    @fecha_nacimiento = args[:fecha_nacimiento]   || ""
  end

  # Guarda el archivo el estudiante en el archivo plano
  def guardar
    return false unless Estudiante.validar_archivo?
    
    return true
  end
end
