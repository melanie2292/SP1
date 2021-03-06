#boolean palindromo?(string s): Función que determina si un string conteniendo una palabra o frase es un palindromo, 
#devolviendo un booleano. Debe ingnorar todo lo que no sea una letra, por ejemplo: “A man, a plan, a canal – Panama”
# es un palíndromo. Como recomendación considere el uso de expresiones regulares.
#boolean palindromo?(string s)

module RubyModule
	def palindrome?(str)
		letters = str.downcase.scan(/\w/)
   		return letters == letters.reverse
	end

	#Hash cuenta_palabras(string s): Función que recibe un string con una frase como argumento, y devuelve un Hash,
	# en donde las llaves son las palabras de la frase, y el valor es la cantidad de veces que dicha palabra aparece en la frase.
	def cuenta_palabras(s)
	  	res = Hash.new(0)
	 	s.downcase.scan(/\w+/).map{|word| res[word] = s.downcase.scan(/\b#{word}\b/).size}
	  	return res

	end

 	#void hanoi(int numero_discos, int t_origen, int t_destino, int t_alterna): Procedimiento que imprime los pasos para resolver el juego Torres de Hanoi.


 	def hanoi(numero_discos, t_origen, t_destino, t_alterna)
		if numero_discos == 1
			p " Mueva el disco de la torre: #{t_origen} hacia la torre: #{t_destino}"
		else
			move(numero_discos-1, t_origen, t_alterna, t_destino)
			move(1, t_origen, t_destino, t_alterna)
			move(numero_discos-1, t_alterna, t_destino, t_origen)
		end
	end



   #Array sort(Array a, boolean asc): Función que recibe un arreglo y devuelve una copia del arreglo ordenado, ascendente o descendentemente, según se indique.


end














































































































































































































































































































































































































