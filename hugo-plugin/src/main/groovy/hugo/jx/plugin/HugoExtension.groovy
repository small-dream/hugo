package hugo.jx.plugin

class HugoExtension {
  def enabled = true

  def setEnabled(boolean enabled) {
    this.enabled = enabled
  }

  def getEnabled() {
    return enabled;
  }
}
