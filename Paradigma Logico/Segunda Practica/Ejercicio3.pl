% Funcion de aplanar una lista de dos dimensiones en una dimension.

aplanar([],[]).
aplanar([H|T],R):- aplanar(T,R1),append(H,R1,R).
