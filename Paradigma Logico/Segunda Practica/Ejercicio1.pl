% Implemente un predicado que, a partir de una lista de cadenas
% de parametro, filtre aquellas que contengan una subcadena que el
% usuario indique en otro argumento.

isSubString(Value,String) :-
        sub_string(String, _, _, _, Value),!.
%	   sub_string(String, Before, Length, After, Value),!.
filterList(Val, In, Out) :-
        include(isSubString(Val), In, Out).
