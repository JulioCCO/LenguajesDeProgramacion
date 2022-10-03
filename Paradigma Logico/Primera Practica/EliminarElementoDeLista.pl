

eliminar([],_,[]).

eliminar([E|T],E,T):-!.

eliminar([H|T],E,L):- eliminar(T,E,N),
    append([H],N,L)
    .


