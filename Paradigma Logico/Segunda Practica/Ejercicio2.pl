% Determine si una lista o un elemento es subconjunto de una lista o
% conjunto

sub_conjunto([],[]):- true.
sub_conjunto([],[_|_]):- true.
sub_conjunto([_|_],[]):- false.
sub_conjunto([H|T],[C|Q]):- H=C,
		sub_conjunto(T,Q).

sub_conjunto([H|T],L2):- pertenece(H,L2),
		sub_conjunto(T,L2).
sub_conjunto([H|_],L2):- not(pertenece(H,L2)),false.

pertenece([],[]).
pertenece(A,[A|_]).
pertenece(C,[_|T]):- pertenece(C,T).
