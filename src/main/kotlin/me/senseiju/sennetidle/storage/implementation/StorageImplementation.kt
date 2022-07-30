package me.senseiju.sennetidle.storage.implementation

import me.senseiju.sennetidle.user.User
import java.util.UUID

interface StorageImplementation {

    fun loadUser(playerId: UUID): User

    fun saveUser(user: User)
}