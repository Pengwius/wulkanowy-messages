package mapping

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Mapping(

    @SerialName("endpoints")
    val endpoints: Map<String, Map<String, Map<String, String>>>,

    @SerialName("vTokens")
    val vTokens: Map<String, Map<String, Map<String, String>>>,

    @SerialName("vTokenScheme")
    val vTokenScheme: Map<String, Map<String, String>>,

    @SerialName("vHeaders")
    val vHeaders: Map<String, Map<String, Map<String, String>>>,
)
