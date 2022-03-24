package com.codingxu97.demojmix.screen.a

import io.jmix.ui.screen.*
import com.codingxu97.demojmix.entity.A

@UiController("A.edit")
@UiDescriptor("a-edit.xml")
@EditedEntityContainer("aDc")
class AEdit : StandardEditor<A>()