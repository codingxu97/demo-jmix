package com.codingxu97.demojmix.screen.b

import io.jmix.ui.screen.*
import com.codingxu97.demojmix.entity.B

@UiController("B.browse")
@UiDescriptor("b-browse.xml")
@LookupComponent("bsTable")
class BBrowse : StandardLookup<B>()