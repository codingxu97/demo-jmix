package com.codingxu97.demojmix.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.DependsOnProperties
import io.jmix.core.metamodel.annotation.JmixEntity
import io.jmix.core.metamodel.annotation.JmixProperty
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "B", indexes = [
    Index(name = "IDX_B_A_ID", columnList = "A_ID")
])
@Entity
open class B {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @JoinColumn(name = "A_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var a: A? = null

    @DependsOnProperties("a")
    @JmixProperty
    fun getName(): String? = a?.name
}