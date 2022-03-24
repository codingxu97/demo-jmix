package com.codingxu97.demojmix.screen.user

import com.codingxu97.demojmix.entity.User
import io.jmix.ui.navigation.Route
import io.jmix.ui.screen.*

@UiController("User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@Route("users")
open class UserBrowse : StandardLookup<User>()