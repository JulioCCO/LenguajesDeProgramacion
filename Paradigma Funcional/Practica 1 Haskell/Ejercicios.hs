module Main where

import Data.List

--Ejercicio 1
filterString :: String -> [String] -> [String]
filterString str list = filter (isInfixOf str) list


--Ejercicio 2
sub_conjunto :: [Int] -> [Int] -> Bool
sub_conjunto xs1 xs2 = if isInfixOf xs1 xs2 then True else False

--Ejercicio 3
aplanar :: [[Int]] -> [Int]
aplanar xss = concat xss

--Ejercicio 4
aplanar' :: [[Int]] -> [Int]
aplanar' xss = map head xss

--Ejercicio 4 
data Tree a
  = Leaf a
  | Node [Tree a]

flatten :: Tree a -> [a]
flatten (Leaf x) = [x]
flatten (Node xs) = xs >>= flatten

main :: IO ()
main = do
    print(filterString "la" ["la casa","el perro","pintando la cerca"])
    
    let l2 = Node [ 
            Node [Leaf 1]
            , Leaf 2
            , Node [Node [Leaf 3, Leaf 4], Leaf 5]
            , Node [Node [Node []]]
            , Node [Node [Node [Leaf 6]]]
            , Leaf 7
            , Leaf 8
            , Node []
                ]

    print(flatten l2)
    
