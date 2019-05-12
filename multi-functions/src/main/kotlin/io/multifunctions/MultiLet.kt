package io.multifunctions

import io.multifunctions.models.*

inline infix fun <A, B, R> Pair<A?, B?>.let(transform: (A?, B?) -> R): R? = transform(first, second)

inline infix fun <A, B, C, R> Triple<A?, B?, C?>.let(transform: (A?, B?, C?) -> R): R? = transform(first, second, third)

inline infix fun <A, B, C, D, R> Quad<A?, B?, C?, D?>.let(transform: (A?, B?, C?, D?) -> R): R? = transform(first, second, third, fourth)

inline infix fun <A, B, C, D, E, R> Penta<A?, B?, C?, D?, E?>.let(transform: (A?, B?, C?, D?, E?) -> R): R? = transform(first, second, third, fourth, fifth)

inline infix fun <A, B, C, D, E, F, R> Hexa<A?, B?, C?, D?, E?, F?>.let(transform: (A?, B?, C?, D?, E?, F?) -> R): R? = transform(first, second, third, fourth, fifth, sixth)

inline infix fun <A, B, C, D, E, F, G, R> Hepta<A?, B?, C?, D?, E?, F?, G?>.let(transform: (A?, B?, C?, D?, E?, F?, G?) -> R): R? = transform(first, second, third, fourth, fifth, sixth, seventh)