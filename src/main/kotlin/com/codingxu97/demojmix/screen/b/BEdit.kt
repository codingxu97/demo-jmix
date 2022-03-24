package com.codingxu97.demojmix.screen.b

import io.jmix.ui.screen.*
import com.codingxu97.demojmix.entity.B

@UiController("B.edit")
@UiDescriptor("b-edit.xml")
@EditedEntityContainer("bDc")
class BEdit : StandardEditor<B>()