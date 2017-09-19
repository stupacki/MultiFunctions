package io.multifunctions

import io.multifunctions.models.*

inline fun <A, B, R> Pair<A?, B?>.let(transform: (A?, B?) -> R): R? = transform(first, second)

inline fun <A, B, C, R> Triple<A?, B?, C?>.let(transform: (A?, B?, C?) -> R): R? = transform(first, second, third)

inline fun <A, B, C, D, R> Quad<A?, B?, C?, D?>.let(transform: (A?, B?, C?, D?) -> R): R? = transform(first, second, third, fourth)

inline fun <A, B, C, D, E, R> Penta<A?, B?, C?, D?, E?>.let(transform: (A?, B?, C?, D?, E?) -> R): R? = transform(first, second, third, fourth, fifth)

inline fun <A, B, C, D, E, F, R> Hexa<A?, B?, C?, D?, E?, F?>.let(transform: (A?, B?, C?, D?, E?, F?) -> R): R? = transform(first, second, third, fourth, fifth, sixth)