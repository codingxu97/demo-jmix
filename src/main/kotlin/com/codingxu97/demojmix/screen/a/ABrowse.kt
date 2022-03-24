package com.codingxu97.demojmix.screen.a

import io.jmix.ui.screen.*
import com.codingxu97.demojmix.entity.A

@UiController("A.browse")
@UiDescriptor("a-browse.xml")
@LookupComponent("asTable")
class ABrowse : StandardLookup<A>()